package com.gargoylesoftware.htmlunit.httpclient;

import java.io.IOException;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import org.apache.http.conn.ssl.X509HostnameVerifier;

public class NoopHostnameVerifierHC4 implements X509HostnameVerifier {
    public static final NoopHostnameVerifierHC4 INSTANCE = new NoopHostnameVerifierHC4();

    public NoopHostnameVerifierHC4() {
    }

    public boolean verify(String s, SSLSession sslSession) {
        return true;
    }



    public final String toString() {
        return "NO_OP";
    }

    @Override
    public void verify(String s, SSLSocket sslSocket) throws IOException {

    }

    @Override
    public void verify(String s, X509Certificate x509Certificate) throws SSLException {

    }

    @Override
    public void verify(String s, String[] strings, String[] strings1) throws SSLException {

    }
}
