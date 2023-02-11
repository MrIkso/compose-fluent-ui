

package com.konyaco.fluent.icons.filled

import androidx.compose.ui.graphics.vector.ImageVector
import com.konyaco.fluent.icons.Icons
import com.konyaco.fluent.icons.fluentIcon
import com.konyaco.fluent.icons.fluentPath

public val Icons.Filled.CommentArrowRight: ImageVector
    get() {
        if (_commentArrowRight != null) {
            return _commentArrowRight!!
        }
        _commentArrowRight = fluentIcon(name = "Filled.CommentArrowRight") {
            fluentPath {
                moveTo(12.02f, 3.0f)
                arcTo(6.5f, 6.5f, 0.0f, false, false, 22.0f, 11.2f)
                verticalLineToRelative(3.55f)
                curveToRelative(0.0f, 1.8f, -1.46f, 3.25f, -3.25f, 3.25f)
                horizontalLineToRelative(-5.79f)
                lineToRelative(-5.38f, 3.82f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.0f, 21.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-0.75f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 2.0f, 14.75f)
                verticalLineToRelative(-8.5f)
                curveTo(2.0f, 4.45f, 3.46f, 3.0f, 5.25f, 3.0f)
                horizontalLineToRelative(6.77f)
                close()
                moveTo(17.5f, 1.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, 0.0f, 11.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 0.0f, -11.0f)
                close()
                moveTo(16.22f, 3.59f)
                lineToRelative(-0.07f, 0.06f)
                lineToRelative(-2.53f, 2.53f)
                lineToRelative(-0.03f, 0.04f)
                lineToRelative(-0.04f, 0.07f)
                lineToRelative(-0.03f, 0.08f)
                lineToRelative(-0.02f, 0.08f)
                verticalLineToRelative(0.14f)
                lineToRelative(0.02f, 0.06f)
                lineToRelative(0.03f, 0.06f)
                lineToRelative(0.03f, 0.06f)
                lineToRelative(0.04f, 0.05f)
                lineToRelative(2.53f, 2.53f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.76f, -0.63f)
                lineToRelative(-0.06f, -0.07f)
                lineTo(15.21f, 7.0f)
                horizontalLineToRelative(5.29f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.41f)
                lineTo(21.0f, 6.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.41f, -0.5f)
                lineTo(15.2f, 6.0f)
                lineToRelative(1.65f, -1.65f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.06f, -0.63f)
                lineToRelative(-0.06f, -0.07f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.63f, -0.06f)
                close()
            }
        }
        return _commentArrowRight!!
    }

private var _commentArrowRight: ImageVector? = null