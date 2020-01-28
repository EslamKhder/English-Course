/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course;

import Design.Log;

/**
 *
 * @author Eng Eslam Khder
 */
public class Cources {

    public static void main(String[] args) throws ClassNotFoundException {
        CoursesSql q = new CoursesSql();
        Log log = new Log();
        log.setSize(340, 330);
        log.setResizable(false);
        log.show();
    }

}
