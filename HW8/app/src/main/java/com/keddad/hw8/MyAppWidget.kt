package com.keddad.hw8

import android.app.PendingIntent
import android.appwidget.AppWidgetManager
import android.appwidget.AppWidgetProvider
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.util.Log
import android.widget.RemoteViews
import kotlin.random.Random

/**
 * Implementation of App Widget functionality.
 */
class MyAppWidget : AppWidgetProvider() {
    override fun onUpdate(
        context: Context,
        appWidgetManager: AppWidgetManager,
        appWidgetIds: IntArray
    ) {
        appWidgetIds.forEach { appWidgetId ->
            updateAppWidget(context, appWidgetManager, appWidgetId )
        }

    }
}

val backgroundColors = listOf(Color.BLACK, Color.BLUE, Color.CYAN, Color.MAGENTA, Color.YELLOW)

internal fun updateAppWidget(
    context: Context,
    appWidgetManager: AppWidgetManager,
    appWidgetId: Int
) {

    Log.wtf("widget", "Called updateAppWidget")
    val widgetNum = Random.nextInt(0, 256)
    val widgetColor = backgroundColors[widgetNum % backgroundColors.size]
    // Construct the RemoteViews object
    val views = RemoteViews(context.packageName, R.layout.my_app_widget)
    views.setTextViewText(R.id.appwidget_text, widgetNum.toString())
    views.setTextColor(R.id.appwidget_text, widgetColor)

    // Instruct the widget manager to update the widget
    appWidgetManager.updateAppWidget(appWidgetId, views)
}