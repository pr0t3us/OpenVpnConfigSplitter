package com.androidpositive.splitter;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.androidpositive.splitter.utils.FileUtils;

public class Splitter {

	public static void main(String[] args) {

		if (0 >= args.length) {
			System.err.println("Invalid arguments count:" + args.length);
			System.exit(1);
		} else {
			String fileName = args[0];
			if (!FileUtils.isFileExist(fileName)) {
				System.err.println("Invalid file name: " + args.length);
			} else {
				// Read config file
				StringBuilder fileContent = FileUtils.readFile(fileName);
				// Loop through matchers, running each one and assigning hits to `output`
				for (Map.Entry<String, String> entry : Const.regexFileMatches.entrySet()) {
				    // Create a Pattern object
				    Pattern pattern = Pattern.compile(entry.getValue());
				    // Now create matcher object.
				    Matcher matcher = pattern.matcher(fileContent.toString());
				    while (matcher.find()) {
				    	// Write certificates to coresponding files
				        FileUtils.writeFile(Const.defaultFileNames.get(entry.getKey()), matcher.group());
				      }
				}				
			}
		}
	}

}
