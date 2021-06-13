package business.concretes;

import business.abstracts.ProductService;
import core.abstracts.LoggerService;
import dataAccess.abstracts.ProductDao;
import entities.concretes.Product;

import java.util.List;

//? manager is kodlarini yapan sinifti

public class ProductManager implements ProductService {

    private ProductDao productDao;
    private LoggerService jloggerService;

    public ProductManager(ProductDao productDao, LoggerService jloggerService) {
        this.productDao = productDao;
        this.jloggerService = jloggerService;
    }

    @Override
    public void add(Product product) {
        //? burda is kodlari yazilir

        if (product.getCategoryId() == 1) {
            System.out.println("Bu kategori de urun kabul edilmiyor.");
            return; // burda veriye erisime gitmesini istemedigimiz icin return yaziyoruz
            //method return'u gördugu an bitirir.
        }
        this.productDao.add(product);
        this.jloggerService.logToSystem("Urun eklendi : "+product.getName());
        //? bu sekilde hicbir zaman Hibernate bagimligimi yok




      /*  HibernateProductDao dao = new HibernateProductDao();
        dao.add(product);

        buraya aktarnetif sistemi enjekte edemeyiz. Burda bagimli hale geldik
        ayrica unit testte yazamayiz
*/

    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
