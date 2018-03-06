package springalgus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
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
	
	@RequestMapping("/korrutus")
	int korrutamine(int arv1, int arv2){
		return arv1*arv2;
	}
	//http://greeny.cs.tlu.ee:40500/korrutus?arv1=12&arv2=3
	
    public static void main(String[] args) {
		//System.getProperties().put("server.port", 40305);
        SpringApplication.run(Rakendus.class, args);
    }
}
