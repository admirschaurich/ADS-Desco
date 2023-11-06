package br.com.schaus.convert.convert;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DecimalFormat;

@RestController
@RequestMapping("/convert")
public class ConvertController {
    @GetMapping("/km-to-mt/{km}")
    @Operation(summary = "Conversão de quilômetros para metros", description = "Essa função executa a conversão de quilômetros para metros.")
    public String getKmToMt(@PathVariable double km){
        double meters = km * 1000;
        DecimalFormat df = new DecimalFormat("#.##");
        return km + " km, é equivalente a " + df.format(meters) + " mt";
    }

    @GetMapping("/mt-to-km/{mt}")
    @Operation(summary = "Conversão de metros para quilômetros", description = "Essa função executa a conversão de metros para quilômetros.")
    public String getMtToKm(@PathVariable double mt){
        double km = mt / 1000;
        DecimalFormat df = new DecimalFormat("#.##");
        return mt + " mt, é equivalente a " + df.format(km) + " km";
    }
}
