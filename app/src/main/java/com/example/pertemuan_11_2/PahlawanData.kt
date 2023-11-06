package com.example.pertemuan_11_2

import android.os.Parcel
import android.os.Parcelable

data class PahlawanData(val gambar: Int, val nama: String): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString()!!
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(gambar)
        parcel.writeString(nama)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<PahlawanData> {
        override fun createFromParcel(parcel: Parcel): PahlawanData {
            return PahlawanData(parcel)
        }

        override fun newArray(size: Int): Array<PahlawanData?> {
            return arrayOfNulls(size)
        }
    }
}

