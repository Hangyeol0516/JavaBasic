package blackBox.camera;

import javax.xml.namespace.QName;

public class FactoryCam {

    public String name;

    public FactoryCam() {
        this.name = name;
    }

    public void takePicture() {
        // 사진 촬영
    }

    public void recordVideo() {
        // 동영상 녹화
    }

    public void detectFire() {
        // 화재 감지
        System.out.println("화재를 감지합니다.");
    }
}
