package com.example.ProdecutSpring;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
	String proname;
    String protype;
    String propostion;
    String proexpirydate;
    public Product() {
    	
    }

   public Product(int id,String proname, String protype, String propostion, String proexpirydate) {
        this.id=id; 
	    this.proname = proname;
        this.protype = protype;
        this.propostion = propostion;
        this.proexpirydate = proexpirydate;
    }
   public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

    public String getProname() {
        return proname;
    }

    public void setProname(String proname) {
        this.proname = proname;
    }

    public String getprotype() {
        return protype;
    }

    public void setprotype(String protype) {
        this.protype = protype;
    }

    public String getpropostion() {
        return propostion;
    }

    public void setpropostion(String propostion) {
        this.propostion = propostion;
    }

    public String getProexpirydate() {
        return proexpirydate;
    }

    public void setProexpirydate(String proexpirydate) {
        this.proexpirydate = proexpirydate;
    }

//    @Override
//    public String toString() {
//        return "Product{" + "proname=" + proname + ", protype=" + protype + ", propostion=" + propostion + ", proexpirydate=" + proexpirydate + "}";
//    }
//    public List<String> toList() {
//        List<String> list = new ArrayList<>();
//        list.add(proname);
//        list.add(protype);
//        list.add(propostion);
//        list.add(proexpirydate);
//        return list;
//    }
       
}
