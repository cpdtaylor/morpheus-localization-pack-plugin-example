# Example Morpheus Language Pack Plugin
An example Morpheus plugin for providing new localized messages that can be used within the UI and Catalog Forms

![](demo.gif)

This plugin will provide a new message in English, German and Klingon. To ensure Klingon is selectable in the Morpheus User/System locale settings, a Klingon Custom Locale is provided in the ExampleLocalizationProvider

The plugin provides the message code "plugin.locale.example.good.morning" saying "Good Morning!" in English, and translated in German and Klingon 

This message code can be used in a Form in Morpheus. Below is the example JSON payload to create a form that uses the message code.

```json
POST /api/library/option-type-forms
{
  "optionTypeForm": {
    "name": "Localization Example",
    "code": "localeExample",
    "description": "An example form with an option type that uses a plugin provided localized label",
    "options": [
      {
        "type": "text",
        "required": false,
        "exportMeta": false,
        "editable": false,
        "displayValueOnDetails": false,
        "isLocked": false,
        "isHidden": false,
        "excludeFromSearch": false,
        "fieldName": "localeExampleInput",
        "fieldLabel": "overwritten",
        "fieldCode": "plugin.locale.example.good.morning"
      }
    ]
  }
}
```

When the Form is loaded in Morpheus, the Label will auto-translate into the users chosen locale.

## EULA
I have read and, by accessing or using any of the scripts set forth herein, agree to the Morpheus Scripts and Plugins License Agreement, and I also understand that ALL SCRIPTS ARE PROVIDED “AS IS”, WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH ANY AND ALL SCRIPTS OR THE USE OR OTHER DEALINGS IN ANY SCRIPTS. This Agreement takes effect when you use or access any of the Scripts.

## Support Statement
This project is not officially supported by Morpheus Data or any of its partners. Morpheus Data claims no responsibility for issues that may arise from attempts to implement this code in your environment. This project is supplied as is and may require modification to implement within your environment. This project does not represent a complete solution to any problem that you may be experiencing and is not intended to fix bugs or issues within the product. Any and all implementation of this code in your environment is done at your own risk. Please follow internal company security requirements for code integration when attempting to integrate this project in your environment.

