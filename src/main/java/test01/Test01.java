package test01;


import org.apache.hadoop.mapreduce.Job;

import java.io.IOException;

public class Test01 {
    public static void main(String[] args){
        try {
            Job job = new Job();
            job.setJarByClass(Test01.class);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
