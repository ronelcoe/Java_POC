package com.test.hackerrank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ScannerBNP {

	//	private static final Scanner scan = new Scanner(System.in);

	private static final Scanner scan = new Scanner("hosts_access_log_00.txt");
	public static void main(String args[]) throws Exception {
		// read the string filename
		String filename = "D:\\Users\\ronel\\git\\Java_POC\\Java_Test\\src\\com\\test\\hackerrank\\hosts_access_log_00.txt";
		String localFilename = "D:\\Users\\ronel\\git\\Java_POC\\Java_Test\\src\\com\\test\\hackerrank\\records_hosts_access_log_00.txt";
		HashMap<String, Integer> hostMap = new HashMap<String, Integer>();

		try (BufferedReader br = new BufferedReader(new FileReader(filename));
 			 BufferedWriter bw = new BufferedWriter(new FileWriter(localFilename))) {
			
			String sCurrentLine;
			while ((sCurrentLine = br.readLine()) != null) {
				String hostName = sCurrentLine.substring(0, sCurrentLine.indexOf(" "));
				if (!hostMap.containsKey(hostName))
					hostMap.put(hostName, 1);
				else
					hostMap.put(hostName, hostMap.get(hostName)+1);
			}

			for (Map.Entry<String, Integer> entry : hostMap.entrySet()) {
				bw.write(entry.getKey() + " " + entry.getValue() + "\n");
			}
		}
	}


}
