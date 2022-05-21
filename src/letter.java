class Address{
    private String country;
    private String province;
    private String city;
    private String street;
    private String number;
    private String department;
    private String postCode;
    public Address(String ct,String pc,String cty,String strt,String num,String dep,String pst){
        country=ct;
        province=pc;
        city=cty;
        street=strt;
        number=num;
        department=dep;
        postCode=pst;
    }
    public String getCountry() {
        return country;
    }

    public String getProvince() {
        return province;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getNumber() {
        return number;
    }

    public String getDepartment() {
        return department;
    }

    public String getPostCode() {
        return postCode;
    }

    public String letterInfo(){
        return postCode+"\n"+country+province+city+street+number+department+"\n";
    }
}
class NativeAddress extends Address{
    public NativeAddress(String ct,String pc,String cty,String strt,String num,String dep,String pst){
        super(ct,pc,cty,strt,num,dep,pst);
    }
    public String letterInfo(){
        return "国内格式为：\n"+super.letterInfo();
    }
}
class AbroadAddress extends Address{
    public AbroadAddress(String ct,String pc,String cty,String strt,String num,String dep,String pst){
        super(ct,pc,cty,strt,num,dep,pst);
    }
    public String letterInfo(){
        return "国外格式为：\n"+getDepartment()+",\n"+getStreet()+getNumber()+",\n"+getProvince()+","+getCity()+","+getPostCode()+".\n";
    }
}

public class letter {
    public static void main(String args[]){
        NativeAddress ar=new NativeAddress("中国","江苏省","南京市","龙蟠路","159号","南京林业大学","11523");
        AbroadAddress aa=new AbroadAddress("中国","江苏省","南京市","龙蟠路","159号","南京林业大学","11523");
        System.out.println(ar.letterInfo());
        System.out.println(aa.letterInfo());
    }
}
