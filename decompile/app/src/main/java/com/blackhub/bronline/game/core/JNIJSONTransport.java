package com.blackhub.bronline.game.core;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.util.Log;
import android.view.inputmethod.InputMethodManager;
import com.blackhub.bronline.game.GUIManager;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.blackhub.bronline.game.gui.playerslist.utils.PlayersListUtilsKt;
import com.bless.client.R;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class JNIJSONTransport {
    public static final String NO_ERROR_MESSAGE = "Не получено сообщение об ошибке";
    public static CountDownLatch latch;

    public static void OnRequestPlayersCompleted(int size, int[] ids, String[] nicks) {
    }

    public static void sendJsonData(int guiid, byte[] data) {
        JNILib.sendJsonData(guiid, data);
    }

    public static void onJsonDataIncoming(final int guiid, byte[] data) {
        String str;
        try {
            str = new String(data, "windows-1251");
        } catch (UnsupportedEncodingException unused) {
            str = null;
        }
        if (str != null) {
            try {
                final JSONObject jSONObject = new JSONObject(str);
                JNIActivity.getContext().runOnUiThread(new Runnable() { // from class: com.blackhub.bronline.game.core.JNIJSONTransport.1
                    @Override // java.lang.Runnable
                    public void run() {
                        GUIManager.getInstance().onPacketIncoming(guiid, jSONObject);
                    }
                });
            } catch (JSONException unused2) {
            }
        }
    }

    public static void onDialogRPCIncoming(int dialogid, int style, byte[] header, byte[] content, byte[] btn1, byte[] btn2) throws JSONException {
        String str;
        String str2;
        String str3;
        String str4 = null;
        try {
            str3 = new String(header, "windows-1251");
            try {
                str = new String(content, "windows-1251");
                try {
                    str2 = new String(btn1, "windows-1251");
                    try {
                        str4 = new String(btn2, "windows-1251");
                    } catch (UnsupportedEncodingException unused) {
                    }
                } catch (UnsupportedEncodingException unused2) {
                    str2 = null;
                }
            } catch (UnsupportedEncodingException unused3) {
                str = null;
                str2 = null;
            }
        } catch (UnsupportedEncodingException unused4) {
            str = null;
            str2 = null;
            str3 = null;
        }
        String.format(" {\"o\": 1,\"i\": %d,\"c\": \"%s\",\"s\": \"%s\",\"l\": \"%s\",\"r\": \"%s\" }", Integer.valueOf(style), str3, str, str2, str4);
        try {
            final JSONObject jSONObject = new JSONObject();
            jSONObject.put("o", 1);
            jSONObject.put("i", style);
            jSONObject.put("c", str3);
            jSONObject.put("s", str);
            jSONObject.put("l", str2);
            jSONObject.put("r", str4);
            JNIActivity.getContext().runOnUiThread(new Runnable() { // from class: com.blackhub.bronline.game.core.JNIJSONTransport.2
                @Override // java.lang.Runnable
                public void run() {
                    GUIManager.getInstance().onPacketIncoming(10, jSONObject);
                }
            });
        } catch (JSONException e) {
            Log.d("AXL", e.getMessage());
        }
    }

    public static void onTabEvent(int[] ids, byte[] nicks, int[] level, int[] ping, int event) throws JSONException {
        try {
            String[] strArrSplit = new String(nicks, "windows-1251").split(Pattern.quote("|"));
            final JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            if (event == 0) {
                jSONObject.put("o", 1);
            }
            jSONObject.put("t", event);
            for (int i = 0; i < ids.length; i++) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("id", ids[i]);
                jSONObject2.put(PlayersListUtilsKt.KEY_GET_PLAYER_NICK, strArrSplit[i]);
                jSONObject2.put("level", level[i]);
                jSONObject2.put(PlayersListUtilsKt.KEY_GET_PLAYER_PING, ping[i]);
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("data", jSONArray);
            JNIActivity.getContext().runOnUiThread(new Runnable() { // from class: com.blackhub.bronline.game.core.JNIJSONTransport.3
                @Override // java.lang.Runnable
                public void run() {
                    GUIManager.getInstance().onPacketIncoming(25, jSONObject);
                }
            });
        } catch (Exception unused) {
        }
    }

    public static boolean doFingerPrintSupport() {
        return JNIActivity.getContext().isSupportFingerPrint;
    }

    public static void closeAllWindows() {
        GUIManager.getInstance().closeAllWindows();
    }

    public static void closeAllWindowsExSAMP() {
        GUIManager.getInstance().closeAllWindowsExSAMP();
    }

    public static void onSpawn() {
        GUIManager.getInstance().onSpawn();
    }

    public static byte[] getClipboardString() {
        return UtilsKt.getClipboardStringUtils();
    }

    public static void keyboardOpened(boolean opened) throws JSONException {
        GUIManager.getInstance().isShowingKeyboard(opened);
    }

    public static boolean doRecordAudioPermissionGranted() {
        return JNIActivity.getContext().isRecordAudioPermissionGranted();
    }

    public static void rmlRequestKeyboard() {
        JNIActivity.getContext().runOnUiThread(new Runnable() { // from class: com.blackhub.bronline.game.core.JNIJSONTransport.4
            @Override // java.lang.Runnable
            public void run() {
                JNIActivity.getContext().getInputField().requestFocus();
                ((InputMethodManager) JNIActivity.getContext().getSystemService("input_method")).showSoftInput(JNIActivity.getContext().getInputField(), 2);
            }
        });
    }

    public static void rmlCloseKeyboard() {
        JNIActivity.getContext().runOnUiThread(new Runnable() { // from class: com.blackhub.bronline.game.core.JNIJSONTransport.5
            @Override // java.lang.Runnable
            public void run() {
                ((InputMethodManager) JNIActivity.getContext().getSystemService("input_method")).toggleSoftInput(1, 0);
            }
        });
    }

    public static void showErrorDialog(final String message) {
        final JNIActivity context = JNIActivity.getContext();
        if (context != null) {
            context.runOnUiThread(new Runnable() { // from class: com.blackhub.bronline.game.core.JNIJSONTransport$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    JNIJSONTransport.lambda$showErrorDialog$1(context, message);
                }
            });
        }
    }

    public static /* synthetic */ void lambda$showErrorDialog$1(JNIActivity jNIActivity, String str) {
        AlertDialog.Builder title = new AlertDialog.Builder(jNIActivity).setTitle(jNIActivity.getString(R.string.error_string));
        if (str == null) {
            str = NO_ERROR_MESSAGE;
        }
        title.setMessage(str).setPositiveButton(R.string.common_ok, new DialogInterface.OnClickListener() { // from class: com.blackhub.bronline.game.core.JNIJSONTransport$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                JNIJSONTransport.lambda$showErrorDialog$0(dialogInterface, i);
            }
        }).setCancelable(false).show();
    }

    public static /* synthetic */ void lambda$showErrorDialog$0(DialogInterface dialogInterface, int i) {
        CountDownLatch countDownLatch = latch;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            latch = null;
        }
    }

    public static void awaitDialogClose() throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        latch = countDownLatch;
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            String message = e.getMessage();
            if (message == null) {
                message = NO_ERROR_MESSAGE;
            }
            UtilsKt.crashlyticsRecordNewException(message);
            Thread.currentThread().interrupt();
        }
        JNIActivity context = JNIActivity.getContext();
        if (context != null) {
            context.finish();
        }
    }
}
