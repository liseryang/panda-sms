package org.panda.common.web.waterMark;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;

public class WaterMark {

	public void imgMark(String strOriginalFileName, String strWaterMarkFileName) {
		try {
			// 源文件
			File fileOriginal = new File(strOriginalFileName);
			Image imageOriginal = ImageIO.read(fileOriginal);
			int widthOriginal = imageOriginal.getWidth(null);
			int heightOriginal = imageOriginal.getHeight(null);
			System.out.println("widthOriginal:" + widthOriginal
					+ "\theightOriginal:" + heightOriginal);

			BufferedImage bufImage = new BufferedImage(widthOriginal,
					heightOriginal, BufferedImage.TYPE_INT_RGB);
			Graphics g = bufImage.createGraphics();
			g.drawImage(imageOriginal, 0, 0, widthOriginal, heightOriginal,
					null);

			// 水印文件
			File fileWaterMark = new File(strWaterMarkFileName);
			Image imageWaterMark = ImageIO.read(fileWaterMark);
			int widthWaterMark = imageWaterMark.getWidth(null);
			int heightWaterMark = imageWaterMark.getHeight(null);
			System.out.println("widthWaterMark:" + widthWaterMark
					+ "\theightWaterMark:" + heightWaterMark);

			// 水印文件在源文件的右下角
			g.drawImage(imageWaterMark, widthOriginal - widthWaterMark,
					heightOriginal - heightWaterMark, widthWaterMark,
					heightWaterMark, null);
			g.dispose();

			FileOutputStream fos = new FileOutputStream(strOriginalFileName);
			JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(fos);
			encoder.encode(bufImage);
			fos.flush();
			fos.close();
			fos = null;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("++WaterMark-Build the watermark fail.");
		}
	}

	public static BufferedImage rize(String srcImage, int width, int height)
			throws IOException {
		File fileSrcImage = new File(srcImage);
		Image image = ImageIO.read(fileSrcImage);
		int widthImage = image.getWidth(null);
		int heigthImage = image.getHeight(null);
		BufferedImage srcBufImage = new BufferedImage(widthImage, heigthImage,
				BufferedImage.TYPE_INT_RGB);

		BufferedImage bufTarget = null;
		double sx = (double) width / widthImage;
		double sy = (double) height / heigthImage;

		int type = srcBufImage.getType();
		if (type == BufferedImage.TYPE_CUSTOM) {
			ColorModel cm = srcBufImage.getColorModel();
			WritableRaster raster = cm.createCompatibleWritableRaster(width,
					height);
			boolean alphaPremultiplied = cm.isAlphaPremultiplied();
			bufTarget = new BufferedImage(cm, raster, alphaPremultiplied, null);
		} else
			bufTarget = new BufferedImage(width, height, type);

		Graphics2D g = bufTarget.createGraphics();
		g.setRenderingHint(RenderingHints.KEY_RENDERING,
				RenderingHints.VALUE_RENDER_QUALITY);
		g.drawRenderedImage(srcBufImage,
				AffineTransform.getScaleInstance(sx, sy));
		g.dispose();
		FileOutputStream fos = new FileOutputStream(srcImage);
		JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(fos);
		encoder.encode(bufTarget);
		fos.flush();
		fos.close();
		fos = null;
		return bufTarget;
	}

	// 测试
	public static void main(String[] args) throws IOException {
		WaterMark waterMark = new WaterMark();
		waterMark.imgMark("f://DSC_0331.JPG", "f://watermark.png");
		waterMark.rize("f://DSC_0331.JPG", 600, 400);
	}

}
