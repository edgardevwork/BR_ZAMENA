package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.Log;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import org.xmlpull.p066v1.XmlPullParser;
import org.xmlpull.p066v1.XmlPullParserException;

/* loaded from: classes4.dex */
public class KeyFrames {
    public static final String CUSTOM_ATTRIBUTE = "CustomAttribute";
    public static final String CUSTOM_METHOD = "CustomMethod";
    public static final String TAG = "KeyFrames";
    public static final int UNSET = -1;
    public static HashMap<String, Constructor<? extends Key>> sKeyMakers;
    public HashMap<Integer, ArrayList<Key>> mFramesMap = new HashMap<>();

    static {
        HashMap<String, Constructor<? extends Key>> map = new HashMap<>();
        sKeyMakers = map;
        try {
            map.put("KeyAttribute", KeyAttributes.class.getConstructor(null));
            sKeyMakers.put("KeyPosition", KeyPosition.class.getConstructor(null));
            sKeyMakers.put("KeyCycle", KeyCycle.class.getConstructor(null));
            sKeyMakers.put("KeyTimeCycle", KeyTimeCycle.class.getConstructor(null));
            sKeyMakers.put("KeyTrigger", KeyTrigger.class.getConstructor(null));
        } catch (NoSuchMethodException e) {
            Log.e(TAG, "unable to load", e);
        }
    }

    public void addKey(Key key) {
        if (!this.mFramesMap.containsKey(Integer.valueOf(key.mTargetId))) {
            this.mFramesMap.put(Integer.valueOf(key.mTargetId), new ArrayList<>());
        }
        ArrayList<Key> arrayList = this.mFramesMap.get(Integer.valueOf(key.mTargetId));
        if (arrayList != null) {
            arrayList.add(key);
        }
    }

    public KeyFrames() {
    }

    public KeyFrames(Context context, XmlPullParser parser) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        Exception e;
        Key keyNewInstance;
        Constructor<? extends Key> constructor;
        HashMap<String, ConstraintAttribute> map;
        HashMap<String, ConstraintAttribute> map2;
        try {
            int eventType = parser.getEventType();
            Key key = null;
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = parser.getName();
                    if (sKeyMakers.containsKey(name)) {
                        try {
                            constructor = sKeyMakers.get(name);
                        } catch (Exception e2) {
                            Key key2 = key;
                            e = e2;
                            keyNewInstance = key2;
                        }
                        if (constructor != null) {
                            keyNewInstance = constructor.newInstance(null);
                            try {
                                keyNewInstance.load(context, Xml.asAttributeSet(parser));
                                addKey(keyNewInstance);
                            } catch (Exception e3) {
                                e = e3;
                                Log.e(TAG, "unable to create ", e);
                                key = keyNewInstance;
                                eventType = parser.next();
                            }
                            key = keyNewInstance;
                        } else {
                            throw new NullPointerException("Keymaker for " + name + " not found");
                        }
                    } else if (name.equalsIgnoreCase("CustomAttribute")) {
                        if (key != null && (map2 = key.mCustomConstraints) != null) {
                            ConstraintAttribute.parse(context, parser, map2);
                        }
                    } else if (name.equalsIgnoreCase("CustomMethod") && key != null && (map = key.mCustomConstraints) != null) {
                        ConstraintAttribute.parse(context, parser, map);
                    }
                } else if (eventType == 3 && "KeyFrameSet".equals(parser.getName())) {
                    return;
                }
                eventType = parser.next();
            }
        } catch (IOException e4) {
            e4.printStackTrace();
        } catch (XmlPullParserException e5) {
            e5.printStackTrace();
        }
    }

    public void addAllFrames(MotionController motionController) {
        ArrayList<Key> arrayList = this.mFramesMap.get(-1);
        if (arrayList != null) {
            motionController.addKeys(arrayList);
        }
    }

    public void addFrames(MotionController motionController) {
        ArrayList<Key> arrayList = this.mFramesMap.get(Integer.valueOf(motionController.mId));
        if (arrayList != null) {
            motionController.addKeys(arrayList);
        }
        ArrayList<Key> arrayList2 = this.mFramesMap.get(-1);
        if (arrayList2 != null) {
            Iterator<Key> it = arrayList2.iterator();
            while (it.hasNext()) {
                Key next = it.next();
                if (next.matches(((ConstraintLayout.LayoutParams) motionController.mView.getLayoutParams()).constraintTag)) {
                    motionController.addKey(next);
                }
            }
        }
    }

    public static String name(int viewId, Context context) {
        return context.getResources().getResourceEntryName(viewId);
    }

    public Set<Integer> getKeys() {
        return this.mFramesMap.keySet();
    }

    public ArrayList<Key> getKeyFramesForView(int id) {
        return this.mFramesMap.get(Integer.valueOf(id));
    }
}
