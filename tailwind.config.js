module.exports = {
  content: ["./src/main/resources/templates/**/*.{html,js}","./src/main/resources/templates/*.{html,js}"],
  theme: {
    extend: {
      fontFamily:{
        body:['Kanit', 'sans-serif']
      }
    },
  },
  plugins: [require("daisyui")],
}