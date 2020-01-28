package com.example.ahsan.robi360health;

import android.content.Context;

import androidx.annotation.NonNull;

public class Injection {
    public static MedicineRepository provideMedicineRepository(@NonNull Context context) {
        return MedicineRepository.getInstance(MedicinesLocalDataSource.getInstance(context));
    }
}

