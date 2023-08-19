package annotationconfiguration;

import java.security.InvalidKeyException;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        List.of().stream().filter(i -> i > 5).collect(Collectors.toList());
    }
}



class BaiTap {
    public void bai1() throws InvalidKeyException {
        //...
        throw new InvalidKeyException();
    }

    public void bai2() throws InvalidKeyException {
        //...
        throw new InvalidKeyException();
    }
}

class LamBaiTap {
    private BaiTap baiTap;

    public void lamBaiTap1() {
//        baiTap.bai1();
        lamBaiTapX();
    }

    public void lamBaiTap2() {
//        baiTap.bai2();
        lamBaiTapX();
    }

    public void lamBaiTapX() {
        try {
            baiTap.bai1();
        } catch (InvalidKeyException e) {
            System.out.println(e);
        }
    }

    public void lamBaiTap3() {
        hideException(baiTapX -> baiTap.bai2());
    }

    public void lamBaiTap4() {
        hideException(baiTapX -> baiTap.bai1());
    }

    public void hideException(LamBaiTapHo lamBaiTapHo) {
        try {
            lamBaiTapHo.apply(lamBaiTapHo);
        } catch (InvalidKeyException e) {
            System.out.println(e);
        }
    }
}

@FunctionalInterface
interface LamBaiTapHo<I> {
    void apply(I i) throws InvalidKeyException;
}

