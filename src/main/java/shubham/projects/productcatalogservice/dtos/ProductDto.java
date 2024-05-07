package shubham.projects.productcatalogservice.dtos;

import lombok.Getter;
import lombok.Setter;
import shubham.projects.productcatalogservice.models.Category;

@Getter
@Setter
public class ProductDto {
    private String name;

    private String description;

    private String imageURL;

    private Double price;

    private Category category;
}
