package com.company;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CondicionesClimaticas {
  AccuWeatherAPI apiClima = new AccuWeatherAPI();
  List<Map<String, Object>> condicionesClimaticas = apiClima.getWeather("Buenos Aires, Argentina");


}
