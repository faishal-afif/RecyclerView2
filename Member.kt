package com.example.recyclerview

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Member(
    val imgMember: Int,
    val nameMember: String,
    val nimMember: String,
    val hobbyMember: String
) : Parcelable
