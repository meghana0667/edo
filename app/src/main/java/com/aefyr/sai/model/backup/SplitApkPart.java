package com.aefyr.sai.model.backup;

import androidx.annotation.Nullable;

import com.aefyr.sai.adapters.SelectableAdapter;

import java.io.File;

public class SplitApkPart implements SelectableAdapter.SelectableItem {

    private String mName;
    private File mPath;
    private long mSize;

    public SplitApkPart(String name, File path) {
        mName = name;
        mPath = path;
        mSize = path.length();
    }

    public String getName() {
        return mName;
    }

    public File getPath() {
        return mPath;
    }

    public long getSize() {
        return mSize;
    }

    @Override
    public boolean equals(@Nullable Object obj) {
        return obj instanceof SplitApkPart && ((SplitApkPart) obj).getPath().equals(getPath()) && ((SplitApkPart) obj).getName().equals(getName());
    }

    @Override
    public int hashCode() {
        return mPath.hashCode();
    }

    @Override
    public String toKey() {
        return mPath.getAbsolutePath();
    }
}
