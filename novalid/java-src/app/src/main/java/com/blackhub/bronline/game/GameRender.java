package com.blackhub.bronline.game;

import android.graphics.Bitmap;
import com.blackhub.bronline.game.core.JNIActivity;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class GameRender {
    public static final int LISTENER_TYPE_RENDER = 0;
    public static final int LISTENER_TYPE_TEXTURE = 1;
    public static float OffX = 0.0f;
    public static float OffY = 0.0f;
    public static float OffZ = 0.0f;
    public static final int RENDER_DIMENSION = 512;
    public static final int RENDER_TYPE_CAR = 7;
    public static final int RENDER_TYPE_OBJECT = 0;
    public static final int RENDER_TYPE_SKIN = 2;
    public static GameRender mInstance;

    /* renamed from: rt */
    public final Runtime f384rt = Runtime.getRuntime();
    public final ArrayList<GameRenderInstance> mQueue = new ArrayList<>();

    /* loaded from: classes4.dex */
    public interface GameRenderListener {
        void OnRenderComplete(int id, Bitmap bitmap);
    }

    public interface GameTextureListener {
        void OnTextureGet(int id, Bitmap bitmap);
    }

    private native void initGameRender();

    private native void nativeRequestRender(int type, int id, int modelid, int color1, int color2, float rotX, float rotY, float rotZ, float zoom, float offX, float offY, float offZ, float texWidth, float texHeight);

    private native void nativeRequestRenderTexture(byte[] texture, int id);

    private native void nativeRequestRenderTexturePlate(int type, byte[] number, byte[] region, int id, float rotX, float rotY, float rotZ, float zoom);

    public static GameRender getInstance() {
        if (mInstance == null) {
            mInstance = new GameRender();
        }
        return mInstance;
    }

    public GameRender() {
        initGameRender();
    }

    public void SetOffsets(float X, float Y, float Z) {
        OffX = X;
        OffY = Y;
        OffZ = Z;
    }

    public final synchronized void addRenderInQueue(GameRenderInstance renderInstance) {
        this.mQueue.add(renderInstance);
    }

    public final synchronized GameRenderInstance getRenderFromQueue(int i) {
        return this.mQueue.get(i);
    }

    public final synchronized int getSizeOfRenderQueue() {
        return this.mQueue.size();
    }

    public final synchronized void removeFromRenderQueue(int i) {
        this.mQueue.remove(i);
    }

    public void onNativeRenderComplete(final int id, final byte[] buffer, final int texw, final int texh) {
        for (int i = 0; i < getSizeOfRenderQueue(); i++) {
            GameRenderInstance renderFromQueue = getRenderFromQueue(i);
            if (renderFromQueue.f385id == id) {
                final GameRenderListener gameRenderListener = renderFromQueue.listener;
                if (JNIActivity.getContext() != null) {
                    JNIActivity.getContext().runOnGLThread(new Runnable() { // from class: com.blackhub.bronline.game.GameRender.1
                        @Override // java.lang.Runnable
                        public void run() {
                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(texw, texh, Bitmap.Config.ARGB_8888);
                            bitmapCreateBitmap.setHasAlpha(true);
                            IntBuffer intBufferAsIntBuffer = ByteBuffer.wrap(buffer).order(ByteOrder.BIG_ENDIAN).asIntBuffer();
                            int iRemaining = intBufferAsIntBuffer.remaining();
                            int[] iArr = new int[iRemaining];
                            long jMaxMemory = GameRender.this.f384rt.maxMemory() - GameRender.this.f384rt.totalMemory();
                            if (jMaxMemory > iRemaining) {
                                UtilsKt.crashlyticsLog("GameRender (maxMemory - totalMemory) " + jMaxMemory + " array.length " + iRemaining);
                                intBufferAsIntBuffer.get(iArr);
                                int i2 = texw;
                                bitmapCreateBitmap.setPixels(iArr, 0, i2, 0, 0, i2, texh);
                                GameRenderListener gameRenderListener2 = gameRenderListener;
                                if (gameRenderListener2 != null) {
                                    gameRenderListener2.OnRenderComplete(id, bitmapCreateBitmap);
                                    return;
                                }
                                return;
                            }
                            UtilsKt.crashlyticsLog("GameRender LOW MEMORY (maxMemory - totalMemory) " + jMaxMemory + " array.length " + iRemaining);
                        }
                    });
                }
                removeFromRenderQueue(i);
                return;
            }
        }
    }

    public void onNativeRenderFailure(int id, int errorCode) {
        UtilsKt.crashlyticsRecordNewException("onNativeRenderFailure: id = " + id + "errorCode: " + errorCode);
        for (int i = 0; i < getSizeOfRenderQueue(); i++) {
            if (getRenderFromQueue(i).f385id == id) {
                removeFromRenderQueue(i);
                return;
            }
        }
    }

    public void RequestTexture(String name, int id, GameTextureListener listener) {
        GameRenderInstance gameRenderInstance = new GameRenderInstance();
        gameRenderInstance.f385id = id;
        gameRenderInstance.type = 0;
        gameRenderInstance.listenerTexture = listener;
        addRenderInQueue(gameRenderInstance);
        nativeRequestRenderTexture(name.getBytes(), id);
    }

    public void RequestRender(int type, int id, int modelid, int color1, int color2, float rotX, float rotY, float rotZ, float zoom, GameRenderListener listener) {
        GameRenderInstance gameRenderInstance = new GameRenderInstance();
        gameRenderInstance.f385id = id;
        gameRenderInstance.listener = listener;
        gameRenderInstance.type = 0;
        addRenderInQueue(gameRenderInstance);
        nativeRequestRender(type, id, modelid, color1, color2, rotX, rotY, rotZ, zoom, OffX, OffY, OffZ, 512.0f, 512.0f);
        OffZ = 0.0f;
        OffY = 0.0f;
        OffX = 0.0f;
    }

    public void RequestRenderWithSize(int type, int id, int modelId, int color1, int color2, float rotX, float rotY, float rotZ, float zoom, int renderWidth, int renderHeight, GameRenderListener listener) {
        GameRenderInstance gameRenderInstance = new GameRenderInstance();
        gameRenderInstance.f385id = id;
        gameRenderInstance.listener = listener;
        gameRenderInstance.type = 0;
        addRenderInQueue(gameRenderInstance);
        nativeRequestRender(type, id, modelId, color1, color2, rotX, rotY, rotZ, zoom, OffX, OffY, OffZ, renderWidth, renderHeight);
        OffZ = 0.0f;
        OffY = 0.0f;
        OffX = 0.0f;
    }

    public void RequestRenderWithSize(int type, int id, int modelId, int color1, int color2, float rotX, float rotY, float rotZ, float zoom, float shiftX, float shiftY, float shiftZ, int renderWidth, int renderHeight, GameRenderListener listener) {
        GameRenderInstance gameRenderInstance = new GameRenderInstance();
        gameRenderInstance.f385id = id;
        gameRenderInstance.listener = listener;
        gameRenderInstance.type = 0;
        addRenderInQueue(gameRenderInstance);
        SetOffsets(shiftX, shiftY, shiftZ);
        nativeRequestRender(type, id, modelId, color1, color2, rotX, rotY, rotZ, zoom, OffX, OffY, OffZ, renderWidth, renderHeight);
        OffZ = 0.0f;
        OffY = 0.0f;
        OffX = 0.0f;
    }

    public void onNativeTextureSend(int id, byte[] buffer, int dim, int dimh) {
        for (int i = 0; i < getSizeOfRenderQueue(); i++) {
            GameRenderInstance renderFromQueue = getRenderFromQueue(i);
            if (renderFromQueue.f385id == id) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dim, dimh, Bitmap.Config.ARGB_8888);
                bitmapCreateBitmap.setHasAlpha(true);
                IntBuffer intBufferAsIntBuffer = ByteBuffer.wrap(buffer).order(ByteOrder.BIG_ENDIAN).asIntBuffer();
                int[] iArr = new int[intBufferAsIntBuffer.remaining()];
                intBufferAsIntBuffer.get(iArr);
                bitmapCreateBitmap.setPixels(iArr, 0, dim, 0, 0, dim, dimh);
                renderFromQueue.listenerTexture.OnTextureGet(id, bitmapCreateBitmap);
                removeFromRenderQueue(i);
                return;
            }
        }
    }

    public void RequestTexturePlate(int type, int id, String number, String region, float rotX, float rotY, float rotZ, float zoom, GameTextureListener listener) {
        GameRenderInstance gameRenderInstance = new GameRenderInstance();
        gameRenderInstance.f385id = id;
        gameRenderInstance.type = 1;
        gameRenderInstance.listenerTexture = listener;
        addRenderInQueue(gameRenderInstance);
        nativeRequestRenderTexturePlate(type, number.getBytes(), region.getBytes(), id, rotX, rotY, rotZ, zoom);
    }

    /* loaded from: classes4.dex */
    public static class GameRenderInstance {

        /* renamed from: id */
        public int f385id;
        public GameRenderListener listener;
        public GameTextureListener listenerTexture;
        public int type;

        public GameRenderInstance() {
        }
    }
}
