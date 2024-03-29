package camera.model

import io.github.estivensh4.kapturex.generated.resources.Res
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.StringResource
import state.CaptureMode

@OptIn(ExperimentalResourceApi::class)
enum class CameraOption(
    val titleRes: StringResource,
) {
    Photo(Res.string.photo),
    Video(Res.string.video);
}

expect fun CameraOption.toCaptureMode(): CaptureMode
