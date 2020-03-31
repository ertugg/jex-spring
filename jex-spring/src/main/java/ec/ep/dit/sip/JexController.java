package ec.ep.dit.sip;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tools.CreateCompactFormat;

@RestController
public class JexController {
	
	@Value("${compact.file.path}")
    private String cfFilePath;
	
	
	
	@RequestMapping("/createCompactFormat")
	public void createCompactFormat() throws FileNotFoundException, IOException {
		
		Properties props = new Properties();
		File compactFile = new File(cfFilePath);
		props.load(new BufferedReader(new FileReader(compactFile)));
		CreateCompactFormat.createCompactFromat(props);
	}
	
	
	
	@RequestMapping("/addEurovocIds")
	public void toto() throws FileNotFoundException, IOException {
		
		Properties props = new Properties();
		File compactFile = new File(cfFilePath);
		props.load(new BufferedReader(new FileReader(compactFile)));
		System.out.println(props.getProperty("output"));
	}
	

}