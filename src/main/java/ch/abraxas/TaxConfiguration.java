package ch.abraxas;

import java.util.List;
import java.util.Map;

public class TaxConfiguration {

  private final Map<String, List<TaxBracket>> taxBrackets = Map.of(
      "ABRAXIEN", List.of(
          new TaxBracket(0.02, 1_000.00),
          new TaxBracket(0.04, 8_000.00),
          new TaxBracket(0.10, 20_000.00)
      ),
      "POLARIS", List.of(
          new TaxBracket(0.00, 1_000.00),
          new TaxBracket(0.10, 4_000.00),
          new TaxBracket(0.20, 50_000.00),
          new TaxBracket(0.50, 100_000.00)
      ),
      "STEUERION", List.of(
          new TaxBracket(0.10, 20_000.00)
      )
  );

  public List<TaxBracket> getTaxBrackets(String communityName) {
    return taxBrackets.get(communityName);
  }

}
