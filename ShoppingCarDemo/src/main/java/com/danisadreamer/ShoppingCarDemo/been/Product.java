package com.danisadreamer.ShoppingCarDemo.been;

/**
 * @auther 芮狼Dan
 * @date 2019-06-20 02:04
 */
public class Product {

//   1	"pid"varchar(100)"	"utf8mb4"	"utf8mb4_0900_ai_ci"	"NO"	NULL	""	""	""
//   2	"pname"varchar(200)"	"utf8mb4"	"utf8mb4_0900_ai_ci"	"YES"	NULL	""	""	""
//   3	"estoreprice"double(10,2)"	NULL	NULL	"YES"	NULL	""	""	""
//   4	"markprice"double(10,2)"	NULL	NULL	"YES"	NULL	""	""	""
//   5	"pnum"int(11)"	NULL	NULL	"YES"	NULL	""	""	""
//   6	"cid"int(11)"	NULL	NULL	"YES"	NULL	""	"category(cid)"	""
//   7	"imgurl"varchar(255)"	"utf8mb4"	"utf8mb4_0900_ai_ci"	"YES"	NULL	""	""	""
//   8	"desc"varchar(255)"	"utf8mb4"	"utf8mb4_0900_ai_ci"	"YES"	NULL	""	""	""
//   9	"if_hot"int(11)"	NULL	NULL	"YES"	NULL	""	""	""
//
//    pid
//    pname
//    estoreprice
//    markprice
//    pnum
//    cid
//    imgurl
//    desc
//    ifHot

    private String pid;
    private String pname;
    private double estoreprice;
    private double markprice;
    private int pnum;
    private int cid;
    private String imgurl;
    private String desc;
    private int ifHot;

    public Product() {
    }

    public Product(String pid, String pname, double estoreprice, double markprice, int pnum, int cid, String imgurl, String desc, int ifHot) {
        this.pid = pid;
        this.pname = pname;
        this.estoreprice = estoreprice;
        this.markprice = markprice;
        this.pnum = pnum;
        this.cid = cid;
        this.imgurl = imgurl;
        this.desc = desc;
        this.ifHot = ifHot;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public double getEstoreprice() {
        return estoreprice;
    }

    public void setEstoreprice(double estoreprice) {
        this.estoreprice = estoreprice;
    }

    public double getMarkprice() {
        return markprice;
    }

    public void setMarkprice(double markprice) {
        this.markprice = markprice;
    }

    public int getPnum() {
        return pnum;
    }

    public void setPnum(int pnum) {
        this.pnum = pnum;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getIfHot() {
        return ifHot;
    }

    public void setIfHot(int ifHot) {
        this.ifHot = ifHot;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pid='" + pid + '\'' +
                ", pname='" + pname + '\'' +
                ", estoreprice=" + estoreprice +
                ", markprice=" + markprice +
                ", pnum=" + pnum +
                ", cid=" + cid +
                ", imgurl='" + imgurl + '\'' +
                ", desc='" + desc + '\'' +
                ", ifHot=" + ifHot +
                '}';
    }
}
