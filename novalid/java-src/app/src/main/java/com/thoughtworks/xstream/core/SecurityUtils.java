package com.thoughtworks.xstream.core;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.ConversionException;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.security.InputManipulationException;

/* loaded from: classes8.dex */
public class SecurityUtils {
    public static void checkForCollectionDoSAttack(UnmarshallingContext unmarshallingContext, long j) {
        Integer num;
        int iCurrentTimeMillis = (int) ((System.currentTimeMillis() - j) / 1000);
        if (iCurrentTimeMillis <= 0 || (num = (Integer) unmarshallingContext.get(XStream.COLLECTION_UPDATE_SECONDS)) == null) {
            return;
        }
        Integer num2 = (Integer) unmarshallingContext.get(XStream.COLLECTION_UPDATE_LIMIT);
        if (num2 == null) {
            throw new ConversionException("Missing limit for updating collections.");
        }
        int iIntValue = num.intValue() + iCurrentTimeMillis;
        if (iIntValue <= num2.intValue()) {
            unmarshallingContext.put(XStream.COLLECTION_UPDATE_SECONDS, new Integer(iIntValue));
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Denial of Service attack assumed. Adding elements to collections or maps exceeds ");
        stringBuffer.append(num2.intValue());
        stringBuffer.append(" seconds.");
        throw new InputManipulationException(stringBuffer.toString());
    }
}
