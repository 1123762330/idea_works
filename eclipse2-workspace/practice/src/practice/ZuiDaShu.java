package practice;

public class ZuiDaShu {
    public static void main(String[] args) {
        int[] array = {12,1,2,45,30,50};
        int maxIndex = array[0];//�������ֵΪ������ĵ�һ����
        int minIndex = array[0];//������СֵΪ������ĵ�һ����
        //����ѭ������
        for (int i = 0; i < array.length; i++) {
            if(maxIndex < array[i]){
                maxIndex = array[i];
            }
            if(minIndex > array[i]){
                minIndex = array[i];
            }
        }
        System.out.println("�����������ֵΪ��"+maxIndex+"\t��СֵΪ��"+minIndex);
    }
}