package br.jornal.util;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletContext;

import org.apache.commons.io.FileUtils;
import org.springframework.web.multipart.MultipartFile;

public class AulaFileUtil {

	public static void saveImage(ServletContext servletContext,String pathname, MultipartFile image)
	{
		pathname = servletContext.getRealPath("/") + pathname;
		File file = new File(pathname);
		try {
			FileUtils.writeByteArrayToFile(file, image.getBytes());
			System.out.println();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("ERRO: não foi possível salvar o arquivo: " + pathname);
			e.printStackTrace();
		}
	}
}
