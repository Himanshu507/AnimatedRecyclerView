package com.hoax.animatedrecyclerview;

public class SetData {
    String Title, Description , Price ;
    int Product_Img;

    public SetData(){

    }
    public SetData(String title, String description, String price , int product_Img){
        this.Title = title;
        this.Description = description;
        this.Price = price;
        this.Product_Img = product_Img;
    }

    public String getTitle(){
        return Title;
    }

    public String getDescription(){
        return Description;
    }

    public String getPrice(){
        return Price;
    }

    public int getProduct_Img(){
        return Product_Img;
    }

}
