package annotationconfiguration;

import org.springframework.stereotype.Service;

import java.security.InvalidKeyException;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        List.of().stream().filter(i -> i > 5).collect(Collectors.toList());
    }
}



@Service
class BaiTap {
    public void bai1() throws InvalidKeyException {
        System.out.println("hehe");
        throw new InvalidKeyException();
    }
}

class LamBaiTap {
    private BaiTap baiTap;

    public void lamBaiTap4() {
        hideException(() -> baiTap.bai1());
    }

    public void hideException(LamBaiTapHo lamBaiTapHo) {
        try {
            lamBaiTapHo.apply();
        } catch (InvalidKeyException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        LamBaiTap lamBaiTap = new LamBaiTap();
        lamBaiTap.baiTap = new BaiTap();
        lamBaiTap.lamBaiTap4();

    }
}

@FunctionalInterface
interface LamBaiTapHo {
    void apply() throws InvalidKeyException;
}

