package com.itvillage;

import org.junit.Test;

public class AesTest {
    @Test
    public void shouldTextToEncrypted() {
        AES.encrypt("value", "roni");
    }

    @Test
    public void shouldTextToDecrypted() {
        AES.decrypt("value", "roni");
    }
}
