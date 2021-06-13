package business.concretes;

//todo Manager is yapan siniflardir

import business.abstracts.ProductService;
import core.LoggerService;
import dataAccess.abstracts.ProductDao;
import entities.concretes.Product;

import java.util.List;

public class ProductManager implements ProductService {

    private ProductDao productDao;
    private LoggerService loggerService;

    public ProductManager(ProductDao productDao, LoggerService loggerService) {
        this.productDao = productDao;
        this.loggerService = loggerService;
    }


    @Override
    public void add(Product product) {
//? burda is kodlari yazilir

        if (product.getCategoryId() == 1) {
            System.out.println("Bu kategoride urun kabul edilmiyor");
            return;
        }
        this.productDao.add(product);
        this.loggerService.logToSystem("Urun eklendi : " + product.getName());
    }

    @Override
    public List<Product> getAll() {
        return null;
    }

}
