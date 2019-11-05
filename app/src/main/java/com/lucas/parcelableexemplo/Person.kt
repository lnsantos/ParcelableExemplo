package com.lucas.parcelableexemplo

import android.annotation.SuppressLint
import android.os.Parcel
import android.os.Parcelable

class Person(var name:String?, var group: Int): Parcelable {

    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readInt()
    ) {
    }

    override fun writeToParcel(dest: Parcel?, flags: Int) {
        if(dest != null){
            dest.writeString(name)
            dest.writeInt(group)
        }
    }

    @SuppressLint("WrongConstant") // Permitir utilizar uma constante
    override fun describeContents(): Int {
        return GlobalParcelable.PERSON
    }

    companion object CREATOR : Parcelable.Creator<Person> {
        override fun createFromParcel(parcel: Parcel): Person {
            return Person(parcel)
        }

        override fun newArray(size: Int): Array<Person?> {
            return arrayOfNulls(size)
        }
    }

}