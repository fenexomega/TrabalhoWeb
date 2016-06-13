package br.jornal.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.tomcat.util.security.MD5Encoder;

public class Encoder {
	public static String encode(String string)
	{
		byte[] digest;
		try {
			digest = MessageDigest.getInstance("MD5").digest(string.getBytes());
			return MD5Encoder.encode(digest);

		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

}
