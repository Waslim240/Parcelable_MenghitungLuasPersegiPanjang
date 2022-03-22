package binar.andlima.latihandua

import android.os.Parcel
import android.os.Parcelable

data class DataParcel(val panjang : Int, val lebar : Int) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readInt()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(panjang)
        parcel.writeInt(lebar)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<DataParcel> {
        override fun createFromParcel(parcel: Parcel): DataParcel {
            return DataParcel(parcel)
        }

        override fun newArray(size: Int): Array<DataParcel?> {
            return arrayOfNulls(size)
        }
    }
}

