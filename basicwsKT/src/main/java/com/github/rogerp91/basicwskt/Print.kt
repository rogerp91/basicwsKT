package com.github.rogerp91.basicwskt

/**
 * Created by rpatino on abr/2019
 * Copyright (c) 2019, MercadoLibre S.R.L. All rights reserved.
 */
internal interface Print {

    fun all(text: String?)

    fun console(text: String?)

    fun device(text: String?)

    fun toast(text: String?)

    fun logi(text: String?)

    fun loge(text: String?)

    fun logd(text: String?)

    fun logv(text: String?)
}