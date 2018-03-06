package springalgus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class Rakendus {
	@RequestMapping("/algus")
    String tervitusfunktsioon() {
        return "Mis toimps?";
    }
	//http://greeny.cs.tlu.ee:40500/algus
	
    
    @RequestMapping("/tervitus")
    String tervitus2(String eesnimi){
        return "Tere, "+eesnimi;
    }
	//http://greeny.cs.tlu.ee:40500/tervitus?eesnimi=roland
	
	@RequestMapping("/korrutus/{arv1}/{arv2}")
	String korrutamine(@PathVariable String arv1, @PathVariable String arv2){
		if(arv1==null){return "esimene arv puudub";}
		int vastus=Integer.parseInt(arv1)*Integer.parseInt(arv2);
		return String.valueOf(vastus);
	}
	
    public static void main(String[] args) {
		//System.getProperties().put("server.port", 40305);
        SpringApplication.run(Rakendus.class, args);
    }
}
