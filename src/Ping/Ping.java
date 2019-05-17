package Ping;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.net.InetAddress;
class Ping
/* Name of the class has to be "Main" only if the class is public. */

{
    public static void main (String[] args) throws java.lang.Exception
    {
        // ping google.com
        InetAddress _inet = InetAddress.getByName("");
        boolean _active = _inet.isReachable(10000);
        System.out.println("Google hayattami? "+ _active);
    }
}