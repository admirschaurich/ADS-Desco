package br.com.schaus.convert.convert;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DecimalFormat;

@RestController
@RequestMapping("/convert")
public class ConvertController {
    @GetMapping("/km-to-mt/{km}")
    public String getHelloWorld(@PathVariable double km){
        double meters = km * 1000;
        DecimalFormat df = new DecimalFormat("#.##");
        return km + " km, é equivalente a " + df.format(meters) + " mt";
    }
}
