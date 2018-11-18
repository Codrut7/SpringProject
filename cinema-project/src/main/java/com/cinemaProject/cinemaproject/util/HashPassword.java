package com.cinemaProject.cinemaproject.util;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.bouncycastle.util.encoders.Hex;

public class HashPassword {
	public static String HashPass(String password) throws NoSuchAlgorithmException {
		MessageDigest digest = MessageDigest.getInstance("SHA-256");
		byte[] hash = digest.digest(
		password.getBytes(StandardCharsets.UTF_8));
		String sha256hex = new String(Hex.encode(hash));
		return sha256hex;
	}
}
