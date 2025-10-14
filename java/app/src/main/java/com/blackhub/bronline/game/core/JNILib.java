package com.blackhub.bronline.game.core;

/* loaded from: classes8.dex */
public class JNILib {
    public static native boolean getMutePlayer(int i);

    public static native int getPlayerId();

    public static native int getPlayerVehicleType();

    public static native int getVolumePlayer(int i);

    public static native void init(int i, int i2, int i3, int i4, byte[] bArr, byte[] bArr2);

    public static native void multiTouchEvent(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8);

    public static native void pauseEvent();

    public static native void requestPlayers(byte[] bArr);

    public static native void resize(int i, int i2);

    public static native void resumeEvent();

    public static native void sendChatMessage(byte[] bArr);

    public static native void sendJsonData(int i, byte[] bArr);

    public static native void setDebugMenuVisible(boolean z);

    public static native void setMutePlayer(int i, boolean z);

    public static native void setVolumePlayer(int i, int i2);

    public static native void step();

    public static native void toggleBloor(boolean z);

    public static native void toggleDrawing2dStuff(boolean z);

    static {
        System.loadLibrary("blackrussia-client");
        System.loadLibrary("plugin");
    }
}
