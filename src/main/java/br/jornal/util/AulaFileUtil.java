package br.jornal.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.springframework.web.multipart.MultipartFile;

public class AulaFileUtil {

	public static void saveImage(String pathname, MultipartFile image)
	{
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
