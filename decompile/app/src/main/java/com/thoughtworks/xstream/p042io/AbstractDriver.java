package com.thoughtworks.xstream.p042io;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.thoughtworks.xstream.p042io.naming.NameCoder;
import com.thoughtworks.xstream.p042io.naming.NoNameCoder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;

/* loaded from: classes5.dex */
public abstract class AbstractDriver implements HierarchicalStreamDriver {
    public NameCoder replacer;

    public AbstractDriver() {
        this(new NoNameCoder());
    }

    public AbstractDriver(NameCoder nameCoder) {
        this.replacer = nameCoder;
    }

    public NameCoder getNameCoder() {
        return this.replacer;
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamDriver
    public HierarchicalStreamReader createReader(URL url) {
        try {
            return createReader(FirebasePerfUrlConnection.openStream(url));
        } catch (IOException e) {
            throw new StreamException(e);
        }
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamDriver
    public HierarchicalStreamReader createReader(File file) {
        try {
            return createReader(new FileInputStream(file));
        } catch (FileNotFoundException e) {
            throw new StreamException(e);
        }
    }
}
