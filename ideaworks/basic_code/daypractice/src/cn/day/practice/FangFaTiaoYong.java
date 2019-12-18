package cn.day.practice;

public class FangFaTiaoYong {
        public static void main(String[] args) {
            float a = 75.0f;
            float b = 120.0f;
            float c = 300.0f;
            double aresult = getResult(a);
            double bresult = getResult(b);
            double cresult = getResult(c);
            System.out.println("a的折扣价" + aresult);
            System.out.println("b的折扣价" + bresult);
            System.out.println("b的折扣价" + cresult);

        }

        //public static 数据类型 方法名（定义的变量数据）
        public static double getResult(float yuanjinE) {
            double disresult;//定义结果和类型
            if (yuanjinE < 100) {
                disresult = yuanjinE * 0.9;
            } else if (yuanjinE > 100 & yuanjinE < 200) {
                disresult = yuanjinE * 0.8;
            } else {
                disresult = yuanjinE * 0.7;
            }
            return disresult;//返回结果值
        }
}
