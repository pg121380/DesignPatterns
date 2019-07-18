package structural.proxy.staticproxy;

public class ProxyStar {
    private RealStar star;

    public ProxyStar(RealStar star) {
        this.star = star;
    }

    public void vocal(){
        // 省略代理做的事
        star.sing();
        //省略代理做的事
    }
}
