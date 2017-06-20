package model.trader;

import java.util.Set;

/**
 * Created by matthiasdenu on 6/20/2017.
 */
public interface StockBasket extends Stock {
  void add(StockSingle stock, Integer shares)
          throws IllegalArgumentException;

  void add(String stockSymbol, Integer shares) throws Exception;

  int size();

  int get(StockSingle stock);

  Set<StockSingle> keySet();
}
