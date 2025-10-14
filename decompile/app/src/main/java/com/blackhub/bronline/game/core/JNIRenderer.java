package com.blackhub.bronline.game.core;

import android.opengl.GLSurfaceView;
import android.view.WindowManager;
import com.blackhub.bronline.BuildConfig;
import com.blackhub.bronline.game.core.preferences.Preferences;
import com.blackhub.bronline.game.gui.menupausesettingandmap.NativeKeys;
import com.blackhub.bronline.game.gui.menupausesettingandmap.NewMenuConstants;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class JNIRenderer implements GLSurfaceView.Renderer {
    public static final int BUILD_VARIANT_MARKET = 1;
    public static final int BUILD_VARIANT_RUSTORE = 2;
    public static final int BUILD_VARIANT_SITE = 0;
    public static boolean initialized;

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl, EGLConfig config) {
    }

    public final void initialise(int width, int height) throws JSONException {
        String str;
        int i;
        int i2;
        if (Preferences.getInteger(JNIActivity.getContext(), NewMenuConstants.IS_INIT_SETTING_CONTROL) == -1) {
            Preferences.putInteger(JNIActivity.getContext(), NewMenuConstants.CAR_CONTROL, 0);
            Preferences.putFloat(JNIActivity.getContext(), NewMenuConstants.CAR_CONTROL_SENSIBILITY, 1.0f);
            Preferences.putInteger(JNIActivity.getContext(), NewMenuConstants.HUD_VERSION, 1);
            Preferences.putInteger(JNIActivity.getContext(), NewMenuConstants.CHAT_VERSION, 1);
            Preferences.putFloat(JNIActivity.getContext(), NewMenuConstants.CAR_CAMERA_X_SENSIBILITY, 1.0f);
            Preferences.putFloat(JNIActivity.getContext(), NewMenuConstants.CAR_CAMERA_Y_SENSIBILITY, 1.0f);
            Preferences.putFloat(JNIActivity.getContext(), NewMenuConstants.AIMING_CAMERA_X_SENSIBILITY, 1.0f);
            Preferences.putFloat(JNIActivity.getContext(), NewMenuConstants.AIMING_CAMERA_Y_SENSIBILITY, 1.0f);
            Preferences.putInteger(JNIActivity.getContext(), NewMenuConstants.LOOK_BACK, 1);
            Preferences.putInteger(JNIActivity.getContext(), NewMenuConstants.IS_INIT_SETTING_CONTROL, 1);
        }
        if (Preferences.getInteger(JNIActivity.getContext(), NewMenuConstants.IS_INIT_SETTING_GRAPHIC) == -1) {
            Preferences.putInteger(JNIActivity.getContext(), NewMenuConstants.RESOLUTION, 100);
            Preferences.putInteger(JNIActivity.getContext(), NewMenuConstants.EFFECT_QUALITY, 1);
            Preferences.putInteger(JNIActivity.getContext(), NewMenuConstants.WATER_QUALITY, 0);
            Preferences.putInteger(JNIActivity.getContext(), NewMenuConstants.SHADOW_QUALITY, 0);
            JNIActivity context = JNIActivity.getContext();
            str = NewMenuConstants.HUD_VERSION;
            Preferences.putInteger(context, NewMenuConstants.REFLECTION_ON_CAR, 0);
            Preferences.putInteger(JNIActivity.getContext(), NewMenuConstants.DISTANCE, 1);
            Preferences.putInteger(JNIActivity.getContext(), NewMenuConstants.VEGETATION, 0);
            Preferences.putInteger(JNIActivity.getContext(), NewMenuConstants.FPS, (int) ((WindowManager) JNIActivity.getContext().getSystemService("window")).getDefaultDisplay().getRefreshRate());
            Preferences.putInteger(JNIActivity.getContext(), NewMenuConstants.SSAA, 0);
            Preferences.putInteger(JNIActivity.getContext(), NewMenuConstants.IS_INIT_SETTING_GRAPHIC, 1);
        } else {
            str = NewMenuConstants.HUD_VERSION;
        }
        if (Preferences.getInteger(JNIActivity.getContext(), NewMenuConstants.IS_INIT_SETTING_SOUND) == -1) {
            Preferences.putInteger(JNIActivity.getContext(), NewMenuConstants.ALL_SOUNDS, 100);
            Preferences.putInteger(JNIActivity.getContext(), NewMenuConstants.PARAM_1, 100);
            Preferences.putInteger(JNIActivity.getContext(), NewMenuConstants.PARAM_2, 20);
            Preferences.putInteger(JNIActivity.getContext(), NewMenuConstants.PARAM_3, 1);
            Preferences.putInteger(JNIActivity.getContext(), NewMenuConstants.PARAM_4, 1);
            Preferences.putInteger(JNIActivity.getContext(), NewMenuConstants.PARAM_5, 1);
            i = 0;
            Preferences.putInteger(JNIActivity.getContext(), NewMenuConstants.PARAM_6, 0);
            Preferences.putInteger(JNIActivity.getContext(), NewMenuConstants.IS_INIT_SETTING_SOUND, 1);
        } else {
            i = 0;
        }
        int integer = Preferences.getInteger(JNIActivity.getContext(), NewMenuConstants.VEGETATION);
        if (integer == -1) {
            Preferences.putInteger(JNIActivity.getContext(), NewMenuConstants.VEGETATION, i);
            i2 = 0;
        } else {
            i2 = integer;
        }
        int integer2 = Preferences.getInteger(JNIActivity.getContext(), NewMenuConstants.RESOLUTION);
        int integer3 = Preferences.getInteger(JNIActivity.getContext(), NewMenuConstants.EFFECT_QUALITY);
        int integer4 = Preferences.getInteger(JNIActivity.getContext(), NewMenuConstants.WATER_QUALITY);
        int integer5 = Preferences.getInteger(JNIActivity.getContext(), NewMenuConstants.SHADOW_QUALITY);
        int integer6 = Preferences.getInteger(JNIActivity.getContext(), NewMenuConstants.REFLECTION_ON_CAR);
        int integer7 = Preferences.getInteger(JNIActivity.getContext(), NewMenuConstants.DISTANCE);
        int integer8 = Preferences.getInteger(JNIActivity.getContext(), NewMenuConstants.SSAA);
        int integer9 = Preferences.getInteger(JNIActivity.getContext(), NewMenuConstants.FPS);
        int integer10 = Preferences.getInteger(JNIActivity.getContext(), NewMenuConstants.CAR_CONTROL);
        float f = Preferences.getFloat(JNIActivity.getContext(), NewMenuConstants.CAR_CONTROL_SENSIBILITY);
        float f2 = Preferences.getFloat(JNIActivity.getContext(), NewMenuConstants.CAR_CAMERA_X_SENSIBILITY);
        float f3 = Preferences.getFloat(JNIActivity.getContext(), NewMenuConstants.CAR_CAMERA_Y_SENSIBILITY);
        float f4 = Preferences.getFloat(JNIActivity.getContext(), NewMenuConstants.AIMING_CAMERA_X_SENSIBILITY);
        float f5 = Preferences.getFloat(JNIActivity.getContext(), NewMenuConstants.AIMING_CAMERA_Y_SENSIBILITY);
        int integer11 = Preferences.getInteger(JNIActivity.getContext(), NewMenuConstants.LOOK_BACK);
        int integer12 = Preferences.getInteger(JNIActivity.getContext(), NewMenuConstants.ALL_SOUNDS);
        int integer13 = Preferences.getInteger(JNIActivity.getContext(), NewMenuConstants.PARAM_1);
        int integer14 = Preferences.getInteger(JNIActivity.getContext(), NewMenuConstants.PARAM_2);
        int integer15 = Preferences.getInteger(JNIActivity.getContext(), NewMenuConstants.PARAM_3);
        int integer16 = Preferences.getInteger(JNIActivity.getContext(), NewMenuConstants.PARAM_4);
        int integer17 = Preferences.getInteger(JNIActivity.getContext(), NewMenuConstants.PARAM_5);
        int integer18 = Preferences.getInteger(JNIActivity.getContext(), NewMenuConstants.PARAM_6, 0);
        String str2 = str;
        int integer19 = Preferences.getInteger(JNIActivity.getContext(), str2);
        if (integer19 == -1) {
            Preferences.putInteger(JNIActivity.getContext(), str2, 1);
            integer19 = 1;
        }
        int integer20 = Preferences.getInteger(JNIActivity.getContext(), NewMenuConstants.CHAT_VERSION);
        int integer21 = Preferences.getInteger(JNIActivity.getContext(), NewMenuConstants.KEYBOARD_VERSION);
        int i3 = integer19;
        Preferences.getInteger(JNIActivity.getContext(), NewMenuConstants.SNOW_INTENSITY, 2);
        Preferences.getInteger(JNIActivity.getContext(), NewMenuConstants.WINTER_SLIP, 0);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(NativeKeys.RESOLUTION_NK, integer2);
            jSONObject.put(NativeKeys.EFFECT_QUALITY_NK, integer3);
            jSONObject.put(NativeKeys.WATER_QUALITY_NK, integer4);
            jSONObject.put(NativeKeys.SHADOW_QUALITY_NK, integer5);
            jSONObject.put(NativeKeys.REFLECTION_ON_CAR_NK, integer6);
            jSONObject.put(NativeKeys.DRAW_DISTANCE_NK, integer7);
            jSONObject.put(NewMenuConstants.VEGETATION, i2);
            jSONObject.put(NativeKeys.SSAA_NK, integer8);
            jSONObject.put(NativeKeys.FPS_NK, integer9);
            jSONObject.put(NativeKeys.CAR_CONTROLS_NK, integer10);
            jSONObject.put(NativeKeys.JSOY_SENS_NK, f);
            jSONObject.put(NativeKeys.CAMERA_X_NK, f2);
            jSONObject.put(NativeKeys.CAMERA_Y_NK, f3);
            jSONObject.put(NativeKeys.AIM_CAM_SENS_X_NK, f4);
            jSONObject.put(NativeKeys.AIM_CAM_SENS_Y_NK, f5);
            jSONObject.put(NativeKeys.LOOK_BEHIND_NK, integer11);
            jSONObject.put(NativeKeys.EFF_VOLUME_NK, integer12);
            jSONObject.put(NativeKeys.SPEAK_VOL_NK, integer13);
            jSONObject.put(NativeKeys.MUTE_MICRO_NK, integer17 == 1 ? -1 : integer14);
            jSONObject.put(NativeKeys.SHOW_SPEAKERS_NK, integer15);
            jSONObject.put(NativeKeys.SHOW_VOICE_CHAT_NK, integer16);
            jSONObject.put(NativeKeys.HUD_VERSION_NK, i3);
            jSONObject.put(NativeKeys.CHAT_VERSION_NK, integer20);
            jSONObject.put(NativeKeys.KEYBOARD_VERSION_NK, integer21);
            jSONObject.put(NativeKeys.CENSORED_RADIO, integer18);
            jSONObject.put(NativeKeys.API_URL, BuildConfig.API_URL);
            jSONObject.put(NativeKeys.API_USER_NAME, "");
            jSONObject.put(NativeKeys.API_PASSWORD, "");
            jSONObject.put(NativeKeys.API_BACKUP_URL, BuildConfig.API_BACKUP_URL);
            jSONObject.put(NativeKeys.API_BACKUP_USER_NAME, "");
            jSONObject.put(NativeKeys.API_BACKUP_PASSWORD, "");
            jSONObject.put(NativeKeys.API_USER_AGENT, BuildConfig.API_URL_USER_AGENT);
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().log("jsonWithParameters error, e: " + e);
            FirebaseCrashlytics.getInstance().recordException(e);
        }
        String string = jSONObject.toString();
        Charset charset = StandardCharsets.UTF_8;
        JNILib.init(width, height, BuildConfig.VERSION_CODE, 0, JNIActivity.getContext().getNick().getBytes(charset), string.getBytes(charset));
        initialized = true;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl) {
        if (initialized) {
            JNILib.step();
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl, int width, int height) throws JSONException {
        if (!initialized) {
            initialise(width, height);
        } else {
            JNILib.resize(width, height);
        }
    }
}
