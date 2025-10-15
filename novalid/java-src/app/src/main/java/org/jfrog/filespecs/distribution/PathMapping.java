package org.jfrog.filespecs.distribution;

import java.util.Objects;
import org.apache.commons.lang3.text.ExtendedMessageFormat;

/* loaded from: classes5.dex */
public class PathMapping {
    public String input;
    public String output;

    public PathMapping() {
    }

    public PathMapping(String str, String str2) {
        this.input = str;
        this.output = str2;
    }

    public String getInput() {
        return this.input;
    }

    public String getOutput() {
        return this.output;
    }

    public String toString() {
        return "PathMapping{input='" + this.input + ExtendedMessageFormat.QUOTE + ", output='" + this.output + ExtendedMessageFormat.QUOTE + '}';
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PathMapping pathMapping = (PathMapping) obj;
        return this.input.equals(pathMapping.input) && this.output.equals(pathMapping.output);
    }

    public int hashCode() {
        return Objects.hash(this.input, this.output);
    }
}
