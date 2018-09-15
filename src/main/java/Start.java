import opencv.CV;
import work.FaceRecognition;

public class Start {
    public static void main(String[] args) throws Exception {
        String s1 = "C:\\Users\\27700\\Desktop\\zzy1.jpg";
        String s2 = "C:\\Users\\27700\\Desktop\\zzy2.jpg";
        //CV.cutPic(s1);
        //CV.cutPic(s2);
        FaceRecognition faceRecognition = new FaceRecognition();
        faceRecognition.loadModel();
        faceRecognition.judge(s1, s2);
    }
}
